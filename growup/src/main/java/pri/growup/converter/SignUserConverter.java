package pri.growup.converter;

import pri.growup.base.converter.BaseConverter;
import pri.growup.domain.SignUserDM;
import pri.growup.persistence.dto.GrowUpSigninUser;

import org.springframework.stereotype.Component;

/**
 * The Class SignUserConverter
 */
@Component("signUserConverter")
public class SignUserConverter extends BaseConverter<SignUserDM, GrowUpSigninUser> {
    @Override
    public void convertDomainToDto(SignUserDM domain, GrowUpSigninUser dto) {
        dto.setUserId(domain.getUserId());
        dto.setUserName(domain.getUserName());
        dto.setUserPwd(domain.getUserPwd());
        dto.setUserPhone(domain.getUserPhone());
    }

    @Override
    public void convertDtoToDomain(SignUserDM domain, GrowUpSigninUser dto) {
        domain.setUserId(dto.getUserId());
        domain.setUserName(dto.getUserName());
        domain.setUserPwd(dto.getUserPwd());
        domain.setUserPhone(dto.getUserPhone());
    }
}
