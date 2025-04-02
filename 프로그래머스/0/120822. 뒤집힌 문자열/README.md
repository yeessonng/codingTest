# [level 0] 뒤집힌 문자열 - 120822 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120822) 

### 성능 요약

메모리: 84.8 MB, 시간: 11.77 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 04월 02일 11:25:09

### 문제 설명

<p>문자열 <code>my_string</code>이 매개변수로 주어집니다. <code>my_string</code>을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.</p>

### 배운 점
charAt() 사용해도 되지만, stringbuffer나 stringbuilder 사용해서 reverse()함수 사용해도 가능

- springbuffer일 때
    
    StringBuffer(my_string).reverse().toString();
    
- springBuilder일 때
`return new StringBuilder(myString).reverse().toString();`

왜 string 대신 쓸까?

string은 불변이라 문자열을 조작할 때마다 새로운 객체를 생성한다. < 메모리 낭비가 생길 수 있음

## 📌 주요 특징

| 특징 | 설명 |
| --- | --- |
| **가변성** | 문자열을 자유롭게 추가, 삭제, 수정 가능 |
| **빠른 성능** | 문자열 조작 시 `String`보다 훨씬 빠름 |

---

## ✅ 자주 쓰는 메서드

| 메서드 | 설명 | 예시 |
| --- | --- | --- |
| `append(String s)` | 문자열 뒤에 추가 | `sb.append("World")` |
| `insert(int offset, String s)` | 특정 위치에 삽입 | `sb.insert(5, " Java")` |
| `delete(int start, int end)` | 문자열 일부 삭제 | `sb.delete(0, 5)` |
| `replace(int start, int end, String s)` | 문자열 일부 교체 | `sb.replace(0, 5, "Hi")` |
| `reverse()` | 문자열 반전 | `sb.reverse()` |
| `toString()` | `StringBuilder` → `String` 변환 | `sb.toString()` |

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>"jaron"</td>
<td>"noraj"</td>
</tr>
<tr>
<td>"bread"</td>
<td>"daerb"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>my_string</code>이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><code>my_string</code>이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
