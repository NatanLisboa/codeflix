package com.codeflix.admin.catalog.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodeflixApplicationTest {

    @Test
    public void testCodeflixApplication() {
        Assertions.assertNotNull(new CodeflixApplication());
        CodeflixApplication.main(new String[]{});
    }
}
