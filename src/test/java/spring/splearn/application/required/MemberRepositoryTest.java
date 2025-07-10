package spring.splearn.application.required;

import static spring.splearn.domain.MemberFixture.createMemberRegisterRequest;
import static spring.splearn.domain.MemberFixture.createPasswordEncoder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import jakarta.persistence.EntityManager;
import spring.splearn.domain.Member;

@DataJpaTest
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    void createMember() {
        Member member = Member.register(createMemberRegisterRequest(), createPasswordEncoder());

        memberRepository.save(member);

        entityManager.flush();

    }
}