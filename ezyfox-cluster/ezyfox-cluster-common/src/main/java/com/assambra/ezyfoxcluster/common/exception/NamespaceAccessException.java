package com.assambra.ezyfoxcluster.common.exception;

public class NamespaceAccessException extends RuntimeException {
    private static final long serialVersionUID = 4644662750377901358L;

    public NamespaceAccessException(String message) {
        super(message);
    }

    public NamespaceAccessException(String username, String namespace) {
        super("Access denied for user: " + username + " to namespace: " + namespace);
    }

    public NamespaceAccessException(String username, String namespace, String reason) {
        super("Access denied for user: " + username + " to namespace: " + namespace + ". Reason: " + reason);
    }
}
