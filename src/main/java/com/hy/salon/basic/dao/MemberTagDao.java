package com.hy.salon.basic.dao;

import com.hy.salon.basic.entity.MemberTag;
import com.zhxh.core.data.BaseDAOWithEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component("memberTagDao")
public class MemberTagDao extends BaseDAOWithEntity<MemberTag> {


    public MemberTag getMemberTag(Long memberId){
        String where="member_id=#{memberId}";
        Map parameters = new HashMap();
        parameters.put("memberId", memberId);

        return this.getOne(where,parameters);
    }

    public MemberTag getMemberTag(Long memberId,Long tagId){
        String where="member_id=#{memberId} and tag_id=#{tagId}";
        Map parameters = new HashMap();
        parameters.put("memberId", memberId);
        parameters.put("tagId", tagId);

        return this.getOne(where,parameters);
    }

    public List<MemberTag> getMemberTagList(Long tagId){
        String where="tag_id=#{tagId}";
        Map parameters = new HashMap();
        parameters.put("tagId", tagId);

        return this.getByWhere(where,parameters);
    }

}
