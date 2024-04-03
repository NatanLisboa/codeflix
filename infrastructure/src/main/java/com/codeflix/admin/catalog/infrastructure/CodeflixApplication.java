package com.codeflix.admin.catalog.infrastructure;

import com.codeflix.admin.catalog.application.UseCase;

public class CodeflixApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}