package com.example.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "items")
public class Item {

  @Id
  Integer id;

  @Column(name = "name_item")
  Integer nameItem;

  @Column(name = "user_id")
  private Integer userId;

}
