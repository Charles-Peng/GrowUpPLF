package pri.growup.controller;

import javax.annotation.Resource;
import pri.growup.base.domain.CommonDM;
import pri.growup.constants.exception.GUBusinessException;
import pri.growup.domain.SignUserDM;
import pri.growup.service.UserSignService;

import org.springframework.web.bind.annotation.*;

/**
 * The Class SignUserController
 */
@RestController
@RequestMapping("/user")
public class SignUserController {
    @Resource
    UserSignService userSignService;

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public CommonDM signIn(@RequestParam("userName") String userName, @RequestParam("userPwd") String userPwd) throws GUBusinessException {
        return userSignService.signIn(userName, userPwd);
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public CommonDM signUp(@RequestBody SignUserDM signUserDM) throws GUBusinessException {
        return userSignService.signUp(signUserDM);
    }
}
