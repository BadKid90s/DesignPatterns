package com.wry.filter.type1;

import java.util.ArrayList;
import java.util.List;

/**
 * 满足条件的男生
 */
public class CriteriaMale implements Criteria {
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> malePersons = new ArrayList<Person>(); 
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("MALE")){
            malePersons.add(person);
         }
      }
      return malePersons;
   }
}