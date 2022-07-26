package com.example.demoh2.entity;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
public abstract class Pet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String name;
  @ManyToMany
  @JoinTable(name = "friends",
          joinColumns = {@JoinColumn(name = "friend_id_left")},
          inverseJoinColumns = {@JoinColumn(name = "friend_id_right")})
  List<Pet> friendsList;

}
