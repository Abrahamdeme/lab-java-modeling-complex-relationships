package Association.nurses.Association.repository;

import Association.nurses.Association.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {}
