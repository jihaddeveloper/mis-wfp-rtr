//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 02/01/2021
//  Description: Bangla class  model file

package com.jihad.rtr.wfp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

public class BanglaClass {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date date;
	private long field_offfice_id;
	private long project_name_id;
	private long district_id;
	private long upzila_id;
	private long school_name_id;
	private long visitor_name_id;
	private long visitor_designation_id;
	private long lf_name_id;
	private long lpo_name_id;
	private long class_teacher_name_id;
	private String gender;
	private String is_trained;
	private long grade_id;
	private long section_id;
	private String class_start_time;
	private String class_end_time;
	private String content_name;
	private String period;
	private int total_admitted_student;
	private int total_admitted_girl;
	private int total_admitted_boy;
	private int total_present_student;
	private int total_present_girl;
	private int total_present_boy;
	private String last_followup_topic1;
	private String last_followup_topic2;
	private String last_followup_topic3;
	private long phonemic_awareness_id;
	private String phonemic_awareness_status;
	private String phonemic_awareness_notes;
	private long letter_identification_id;
	private String letter_identification_status;
	private String letter_identification_notes;
	private long vocabulary_identification_id;
	private String vocabulary_identification_status;
	private String vocabulary_identification_notes;
	private long fluency_identification_id;
	private String fluency_identification_status;
	private String fluency_identification_notes;
	private long comprehension_id;
	private String comprehension_status;
	private String comprehension_notes;
	private long writing_activities_id;
	private String writing_activities_status;
	private String writing_activities_notes;
	private long i_do_we_do_you_do_id;
	private String i_do_we_do_you_do_status;
	private String i_do_we_do_you_do_notes;
	private long group_work_id;
	private String group_work_status;
	private String group_work_notes;
	private long time_on_task_id;
	private String time_on_task_status;
	private String time_on_task_notes;
	private long use_teaching_aids_id;
	private String use_teaching_aids_status;
	private String use_teaching_aids_notes;
	private long continuity_of_lessons_id;
	private String continuity_of_lessons_status;
	private String continuity_of_lessons_notes;
	private long assessment_id;
	private String assessment_status;
	private String assessment_notes;
	private long best_pratice1_id;
	private long best_pratice2_id;
	private long best_pratice3_id;
	private long coaching_support1_id;
	private long coaching_support2_id;
	private String coaching_support_details1;
	private String coaching_support_details2;
	private String agreed_statement;
	private String tested_question_1;
	private String tested_question_2;
	private String tested_question_3;
	private String student_1;
	private String student_2;
	private String student_3;
	private String student_4;
	private String student_5;
	private String right_result_for_1;
	private String wrong_result_for_1;
	private String right_result_for_2;
	private String wrong_result_for_2;
	private String right_result_for_3;
	private String wrong_result_for_3;
	private String right_result_for_4;
	private String wrong_result_for_4;
	private String right_result_for_5;
	private String wrong_result_for_5;
	private String isActive;
	private String isDeleted;
	
	
}
