package spring.batch.exam.domain.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.batch.exam.domain.member.Member;
import spring.batch.exam.domain.member.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member join(String username, String password, String email) {
        Member member = Member
                .builder()
                .username(username)
                .password(password)
                .email(email)
                .build();

        memberRepository.save(member);

        return member;
    }
}