package com.a505.hobbyit.hobbymember.domain;

import com.a505.hobbyit.article.dto.OwnHobbyResponse;
import com.a505.hobbyit.member.domain.Member;

import java.util.List;

public interface HobbyMemberQRepository {
    List<OwnHobbyResponse> getOwnHobbyList(Member member);
}
