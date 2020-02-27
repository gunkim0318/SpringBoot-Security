package SpringBoot.Security.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Role {
    USER("유저"),
    GUEST("게스트"),
    ADMIN("관리자");

    private final String realName;
}