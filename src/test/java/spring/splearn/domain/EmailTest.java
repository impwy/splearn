package spring.splearn.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {
    @Test
    void equality() {
        var email1 = new Email("foo@bar.app");
        var email2 = new Email("foo@bar.app");

        assertThat(email1).isEqualTo(email2);
    }
}