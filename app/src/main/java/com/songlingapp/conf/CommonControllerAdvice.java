package com.songlingapp.conf;



import com.songlingapp.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@ControllerAdvice(annotations = { RestController.class})
public class CommonControllerAdvice {
    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public R handleException(Throwable throwable) throws IOException {
        log.error("应用调用Controller异常",throwable);
        return R.failed("调用异常，异常信息"+throwable.getMessage());
    }
}
