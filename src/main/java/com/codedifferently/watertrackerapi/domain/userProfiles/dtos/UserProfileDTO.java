package com.codedifferently.watertrackerapi.domain.userProfiles.dtos;

import com.codedifferently.watertrackerapi.domain.userProfiles.models.UserProfile;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserProfileDTO {
    private String id;
    private String fullName;
    private Integer numberOfFollowers;

    public UserProfileDTO(UserProfile userProfile){
        id = userProfile.getId();
        fullName = String.format("%s %s",userProfile.getFirstName(),userProfile.getLastName());
        numberOfFollowers = userProfile.getFollowers().size();
    }
}
