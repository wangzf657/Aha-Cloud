package com.aha.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 监控中心
 *
 * @author aha
 */
@EnableAdminServer
@SpringBootApplication
public class AhaMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AhaMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  监控中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" + " .-------. "
                + "      ____     __        \n" + " |  _ _   \\      \\   \\ "
                + "  " + "/  /    \n" + " | ( ' )  |       \\  _. /  '       "
                + "\n" + " |" + "(_ o _) /        _( )_ .'         \n" + " | "
                + "(_,_).' __  ___" + "(_ o _)'          \n" + " |  |\\ \\  |" +
                "  " + "||   |(_,_)'        " + " \n" + " |  | \\ `'   /|   " +
                "`-'  /  " + "         \n" + " |  |  \\" + "    /  \\      / " +
                "          \n" + " ''-'   `'-'    `-..-'    " + "          ");
    }
}
