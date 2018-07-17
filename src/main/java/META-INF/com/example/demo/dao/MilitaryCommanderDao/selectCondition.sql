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
  --,m0.version_no
FROM
  military_commander m0
  INNER JOIN sex_div l0
    ON m0.sex_div_id = l0.sex_div_id
WHERE
  m0.is_disabled = 0
  --
  /*%if condition.militaryCommanderName != null && condition.militaryCommanderName != ""*/
    AND m0.military_commander_name LIKE '%' + /* condition.militaryCommanderName */'夏' + '%'
  /*%end*/
  --カナ
  /*%if condition.phonetic != null && condition.phonetic != ""*/
    AND m0.phonetic LIKE '%' + /* condition.phonetic */'カ' + '%'
  /*%end*/
  --性別
  /*%if condition.sexDivId != null && condition.sexDivId != 0*/
    AND m0.sex_div_id = /* condition.sexDivId */1
  /*%end*/
  --生年
  /*%if condition.birthYearFrom != null && condition.birthYearFrom != 0*/
    AND m0.birth_year >= /* condition.birthYearFrom */100
  /*%end*/
  /*%if condition.birthYearTo != null && condition.birthYearTo != 0*/
    AND m0.birth_year <= /* condition.birthYearTo */300
  /*%end*/
  --没年
  /*%if condition.deathYearFrom != null && condition.deathYearFrom != 0*/
    AND m0.death_year >= /* condition.deathYearFrom */100
  /*%end*/
  /*%if condition.deathYearTo != null && condition.deathYearTo != 0*/
    AND m0.death_year <= /* condition.deathYearTo */300
  /*%end*/
  --統率
  /*%if condition.leadershipFrom != null && condition.leadershipFrom != 0*/
    AND m0.leadership >= /* condition.leadershipFrom */1
  /*%end*/
  /*%if condition.leadershipTo != null && condition.leadershipTo != 0*/
    AND m0.leadership <= /* condition.leadershipTo */100
  /*%end*/
  --武力
  /*%if condition.militaryForceFrom != null && condition.militaryForceFrom != 0*/
    AND m0.military_force >= /* condition.militaryForceFrom */1
  /*%end*/
  /*%if condition.militaryForceTo != null && condition.militaryForceTo != 0*/
    AND m0.military_force <= /* condition.militaryForceTo */100
  /*%end*/
  --知力
  /*%if condition.intellectFrom != null && condition.intellectFrom != 0*/
    AND m0.intellect >= /* condition.intellectFrom */1
  /*%end*/
  /*%if condition.intellectTo != null && condition.intellectTo != 0*/
    AND m0.intellect <= /* condition.intellectTo */100
  /*%end*/
  --政治
  /*%if condition.politicsFrom != null && condition.politicsFrom != 0*/
    AND m0.politics >= /* condition.politicsFrom */1
  /*%end*/
  /*%if condition.politicsTo != null && condition.politicsTo != 0*/
    AND m0.politics <= /* condition.politicsTo */100
  /*%end*/
  --無双登場
  /*%if condition.isDynastyWarriorsAppeared != null && condition.isDynastyWarriorsAppeared*/
    AND m0.is_dynasty_warriors_appeared = 1
  /*%end*/
ORDER BY
  m0.display_order
