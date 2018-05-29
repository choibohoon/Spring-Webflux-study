package com.example.research.profile.v1.profile;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileSaveRequest implements Serializable {
  private String id;
  private String name;
  private Integer age;
  private String sex; // man, woman
}
