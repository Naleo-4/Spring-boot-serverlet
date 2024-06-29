package com.example.test;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

@Configuration
public class SshTunnelConfig {

    @Value("${ssh.host}")
    private String sshHost;

    @Value("${ssh.port}")
    private int sshPort;

    @Value("${ssh.user}")
    private String sshUser;

    @Value("${ssh.password}")
    private String sshPassword;

    @Value("${ssh.local.port}")
    private int localPort;

    @Value("${ssh.remote.host}")
    private String remoteHost;

    @Value("${ssh.remote.port}")
    private int remotePort;

    @Bean
    public Session setupSshTunnel() throws Exception {
        JSch jsch = new JSch();
        Session session = jsch.getSession(sshUser, sshHost, sshPort);
        session.setPassword(sshPassword);
        session.setConfig("StrictHostKeyChecking", "no");
        session.connect();
        session.setPortForwardingL(localPort, remoteHost, remotePort);
        return session;
    }
}

