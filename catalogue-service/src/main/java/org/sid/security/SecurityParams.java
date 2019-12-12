package org.sid.security;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME = "Authorization";
    public static final String SECRET = "Pa$$w0rd";
    public static final long EXPIRATION = 10*24*3600*1000;
    public static final String HEADER_PREFIXE = "Bearer ";
}
