package com.wry.filter.type1;

import java.util.List;

/**
 * 条件汇和，满足两个条件的人
 */
public class AndCriteria implements Criteria {
 
   private Criteria criteria;
   private Criteria otherCriteria;
 
   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);     
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}