package com.sgx.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
