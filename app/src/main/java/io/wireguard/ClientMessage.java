package io.wireguard;

public enum ClientMessage {
    REGISTER_CLIENT,
    UNREGISTER_CLIENT,
    DISCONNECT,
    UPDATE_CONNECTION_STATUS,
    UPDATE_CONNECTION_INFO,
    UPDATE_SESSION_STAT;
}
