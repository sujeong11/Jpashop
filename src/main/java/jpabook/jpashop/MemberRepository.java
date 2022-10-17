package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
        // 커맨드와 쿼리를 분리해라라는 원칙 => 저장 후 리턴 값을 거의 안만들지만 id값 정도 있으면 다시 조회 할 수 있으니 이렇게 코드 작성
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
