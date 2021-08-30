package com.nibm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubCategory {
@Id
@GeneratedValue
int categoryID;
String subCategory;
}
