package ru.insoft.h2;

import java.sql.SQLException;
import org.h2.tools.Server;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class H2Server {

    public static void main(String[] args) throws SQLException {
        final Server server = Server.createTcpServer("-tcpAllowOthers", "-tcpPort", "9092");
        server.start();
    }
}
