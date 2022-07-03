package codingtest.devmatching;

-- 코드를 입력하세요
SELECT mid(CREATED_AT,6,2) MONTH, NAME, count(*) COUNT from place_reviews as pr join places as p on pr.place_id = p.id
where left(CREATED_AT,4)=2018 group by 1 ;