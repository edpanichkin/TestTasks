package com.example.demoh2.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Snake extends Pet{

  int length;
}
