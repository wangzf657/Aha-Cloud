package com.aha.job;

import com.aha.common.security.annotation.EnableCustomConfig;
import com.aha.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 定时任务
 *
 * @author aha
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class AhaJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(AhaJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" + " " +
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
