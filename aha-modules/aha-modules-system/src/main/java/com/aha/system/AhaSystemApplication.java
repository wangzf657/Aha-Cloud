package com.aha.system;

import com.aha.common.security.annotation.EnableCustomConfig;
import com.aha.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 *
 * @author aha
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class AhaSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(AhaSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" + " .-------. "
                + "      ____     __        \n" + " |  _ _   \\      \\   \\ "
                + "  " + "/  /    \n" + " | ( ' )  |       \\  _. /  '       "
                + "\n" + " |" + "(_ o _) /        _( )_ .'         \n" + " | "
                + "(_,_).' __  ___" + "(_ o _)'          \n" + " |  |\\ \\  |" +
                "  " + "||   |(_,_)'        " + " \n" + " |  | \\ `'   /|   " +
                "`-'  /  " + "         \n" + " |  |  \\" + "    /  \\      / " +
                "          \n" + " ''-'   `'-'    `-..-'    " + "          ");
    }
}
