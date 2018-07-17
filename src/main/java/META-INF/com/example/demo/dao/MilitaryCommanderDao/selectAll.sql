SELECT 
   military_commander_id
  ,military_commander_name
  ,phonetic
  ,m0.sex_div_id
  ,l0.sex_div_name
  ,birth_year
  ,death_year
  ,leadership
  ,military_force
  ,intellect
  ,politics
  ,is_dynasty_warriors_appeared
  ,display_order
  ,m0.is_disabled
  ,m0.created_at
  ,m0.created_user
  ,m0.updated_at
  ,m0.updated_user
  ,m0.version_no
FROM 
  military_commander m0
  INNER JOIN sex_div l0
    ON m0.sex_div_id = l0.sex_div_id
