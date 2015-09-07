;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 10: Intro to Maps

;What I pasted in the box:
20

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 16: Hello World

;What I pasted in the box:
(fn [n] (str "Hello, " n "!"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 17: Sequences: map

;What I pasted in the box:
'(6 7 8)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 18: Sequences: filter

;What I pasted in the box:
'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 20 - Penultimate Element

;What I pasted in the box:
#(nth %1 (- (count %1) 2))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 21 - Nth Element

;What I pasted in the box:
(fn myNth[n m] (if (> m 0) (myNth(rest n) (- m 1))(first n)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 23 - Reverse a Sequence

;What I pasted in the box:
(fn myReverse[n] (if (= (peek (vec n)) nil) [] (conj (myReverse (subvec (vec n) 1 (count (vec n)))) (get (vec n) 0) )))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 25 - Find the odd numbers

;What I pasted in the box:
filter odd?

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 37 - Regular Expressions

;What I pasted in the box:
"ABC"

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 40 - Interpose a Seq

;What I pasted in the box:
(fn myInterpose[n m] (if (> (count m) 1) (concat (vector (get m 0) x) (myInterpose n (subvec m 1 (count m)))) (vector (get m 0))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 43 - Reverse Interleave

;What I pasted in the box:
(fn reverseInterLeave[m, p] (reverse ((fn reverseInterLeaveIt [n, f] 
      (if (> (count n) 1) 
        (reverseInterLeaveIt (first (rest n)) (conj f (first n))) 
        (conj f (first n)))) ((fn main[x, y & [c]]
  (if ( = c y)
  nil
  (remove nil? (list   
   ((fn helper[l, c] 
      (if (< c (count l)) 
         (concat (list (nth l c)) (helper l (+ c y))) 
         nil)) x 0 ) 
   (main (rest x) y (if c (+ c 1) 1)) ) ) )) m p) '())))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 44 - Rotate Sequence

;What I pasted in the box:

(fn rotate[x, y] (
                  if (< x 0)
                    (rotate (+ x 1) (concat (list (last y)) (subvec (vec y) 0 (- (count y) 1))))
                    (if (> x 0)
                      (rotate (- x 1) (concat (rest y) (list (first y))))
                      y
                    )
                  )
                  
                  
                  )
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 46 - Flipping out

;What I pasted in the box:
  (fn [f] (fn [n m] (f m n)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 47 - Contain yourself

;What I pasted in the box:
4
