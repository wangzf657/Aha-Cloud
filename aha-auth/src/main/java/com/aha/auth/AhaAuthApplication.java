package com.aha.auth;

import com.aha.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 认证授权中心
 *
 * @author aha
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AhaAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AhaAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" + " " +
                ".-------" + ".       ____     __        \n" + " |  _ _   \\ "
                + "     \\   \\ " + "  /  /    \n" + " | ( ' )  |       \\  _" +
                ". " + "/  '       \n" + " |(_ o _) /        _( )_ .'        " +
                " \n" + " | (_,_).' __  " + "___(_ o _)'          \n" + " |  " +
                "|\\ \\  " + "|  ||   |(_,_)'     " + "    \n" + " |  | \\ `'" +
                "   /|   `-'  " + "/           \n" + " |  | " + " \\    /  \\" +
                "      /           " + "\n" + " ''-'   `'-'    `-..-' " + "  " +
                "           ");
    }
}
