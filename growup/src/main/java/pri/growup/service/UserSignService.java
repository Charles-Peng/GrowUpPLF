package pri.growup.service;

import javax.annotation.Resource;
import pri.growup.base.domain.CommonDM;
import pri.growup.base.service.BaseService;
import pri.growup.constants.enums.DeleteFlg;
import pri.growup.constants.enums.ExceptionCode;
import pri.growup.constants.exception.GUBusinessException;
import pri.growup.converter.SignUserConverter;
import pri.growup.domain.SignUserDM;
import pri.growup.persistence.dto.GrowUpSigninUser;
import pri.growup.persistence.dto.GrowUpSigninUserExample;
import pri.growup.persistence.mapper.GrowUpSigninUserMapper;
import pri.growup.util.DataUtils;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * The Class UserSignService
 * 用户操作service
 *
 * @author PLF
 */
@Service
public class UserSignService extends BaseService<SignUserDM> {
    @Resource
    private GrowUpSigninUserMapper signinUserMapper;

    @Resource(name = "signUserConverter")
    private SignUserConverter signUserConverter;

    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param userPwd  密码
     * @return 结果
     * @throws GUBusinessException 业务异常
     */
    public CommonDM signIn(final String userName, final String userPwd) throws GUBusinessException {
        CommonDM commonDM = new CommonDM();

        GrowUpSigninUserExample selectExample = new GrowUpSigninUserExample();
        GrowUpSigninUserExample.Criteria criteria = selectExample.createCriteria();
        if (!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(userPwd)) {
            criteria.andUserNameEqualTo(userName).andUserPwdEqualTo(userPwd)
                    .andDeleteFlgEqualTo(DeleteFlg.NOTDELETE.getCodeNum());
            List<GrowUpSigninUser> userList = signinUserMapper.selectByExample(selectExample);
            if (!CollectionUtils.isEmpty(userList)) {
                commonDM.setData(true);
            } else {
                // 用户名或密码错误
                businessExcptionHandle(ExceptionCode.USER_NAME_OR_PWD_IS_WRONG);
            }
        } else {
            // 用户名或密码不能为空
            businessExcptionHandle(ExceptionCode.USER_NAME_OR_PWD_CAN_NOT_EMPTY);
        }


        return commonDM;
    }

    /**
     * 用户登出 TODO
     *
     * @param userName 用户名
     * @return 结果
     */
    public CommonDM signOut(final String userName) {

        return null;
    }

    /**
     * 用户注册
     *
     * @param signUserDM 用户信息
     * @return 结果
     * @throws GUBusinessException 业务错误
     */
    public CommonDM signUp(final SignUserDM signUserDM) throws GUBusinessException {
        CommonDM commonDM = new CommonDM();
        businessExcptionHandle(checkParams(signUserDM));
        signUserDM.setUserId(DataUtils.getNewID());
        GrowUpSigninUser signinUser = new GrowUpSigninUser();
        signUserConverter.convertDomainToDto(signUserDM, signinUser);
        int i = signinUserMapper.insertSelective(signinUser);
        if (i > 0) {
            commonDM.setData(true);
        }
        return commonDM;
    }


    @Override
    protected ExceptionCode checkParams(SignUserDM signUserDM) {
        ExceptionCode exceptionCode = null;
        if (StringUtils.isEmpty(signUserDM.getUserName())) {
            exceptionCode = ExceptionCode.USER_NAME_CAN_NOT_EMPTY;
        } else if (StringUtils.isEmpty(signUserDM.getUserPwd())) {
            exceptionCode = ExceptionCode.USER_PWD_CAN_NOT_EMPTY;
        } else if (StringUtils.isEmpty(signUserDM.getUserPhone())) {
            exceptionCode = ExceptionCode.PHONE_CAN_NOT_EMPTY;
        }
        return exceptionCode;
    }

}
