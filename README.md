# Sentiment-Analyzer
##Student Names and Numbers
- Ryan O'Connor: 6852747
- Andy Tang: 6815495

##Task Division
For task division we each contributed a part of each step in the assignment.

##Steps Taken In Part 1
For part 1, we simply took the provided file on the course website and opened it in Weka. In order to use the tweet words as features,
we used the StringToWordVector filter. This extracted all the words from the tweets and created features to be used by the classifiers.
We then ran the SMO, NB, and J48 classifiers to get baseline results going forward.

Additionally for part 1 once we had gotten our baseline results, we removed stop words from the tweets using a similar dictionary to what
we used in assignment 1.

Below you can see the baseline results compared to the remove stop words results:
###NaiveBayes Baseline
- Correctly Classified Instances      
  - `3271`              
  - `45.242 %`
- Incorrectly Classified Instances      
  - `3959`
  - `54.758 %`
- Kappa statistic: `0.2198`
- Mean absolute error: `0.2973`
- Root mean squared error: `0.4345`
- Relative absolute error: `85.842 %`
- Root relative squared error: `104.4266 %`
- Total Number of Instances: `7230`     

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class     |
| --------- |:------:|:----------:|:----------:|
| 0.598  | 0.573 |  0.586 |  positive          |
| 0.333  | 0.465 |  0.388 |  negative          |
| 0.313  | 0.181 |  0.229 |  neutral           |
| 0.366  | 0.458 |  0.407 |  objective         |
| 0.454  | 0.452 |  0.447 | **`Weighted Avg`** |

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 1883 | 690 | 295 | 416 | a = positive      |
| 425  | 601 | 140 | 127 | b = negative      |
| 538  | 395 | 280 | 334 | c = neutral       |
| 302  | 118 | 179 | 507 | d = objective     |

----------------------------------------------------------------------------------------------------------------

###SMO Baseline
- Correctly Classified Instances        
  - `3801`               
  - `52.5726 %`
- Incorrectly Classified Instances      
  - `3429`               
  - `47.4274 %`
- Kappa statistic: `0.2909`
- Mean absolute error: `0.3176`
- Root mean squared error: `0.4027`
- Relative absolute error: `91.7119 %`
- Root relative squared error: `96.7841 %`
- Total Number of Instances: `7230`     

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.616     | 0.734  | 0.67       | positive         |
| 0.468     | 0.388  | 0.425      | negative         |
| 0.359     | 0.308  | 0.331      | neutral          |
| 0.45      | 0.373  | 0.408      | objective        |
| 0.509     | 0.526  | 0.513      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
|2410  | 286 | 392 | 196 | a = positive      |
|496   | 502 | 210 |  85 | b = negative      |
|645   | 203 | 476 | 223 | c = neutral       |
|364   | 81  | 248 | 413 | d = objective     |

----------------------------------------------------------------------------------------------------------------

###J48 Baseline
- Correctly Classified Instances        
  - `3285`
  - `45.4357 %`
- Incorrectly Classified Instances     
  - `3945`               
  - `54.5643 %`
- Kappa statistic: `0.1863`
- Mean absolute error: ` 0.291`
- Root mean squared error: `0.462`
- Relative absolute error: `84.0483 %`
- Root relative squared error: `111.0354 %`
- Total Number of Instances: `7230`     

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.568     | 0.671  | 0.615      |  positive        |
| 0.355     | 0.31   | 0.331      |  negative        |
| 0.297     | 0.244  | 0.268      |  neutral         |
| 0.321     | 0.275  | 0.296      |  objective       |
| 0.434     | 0.454  | 0.441      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
|2203  | 387 | 426 | 268 | a = positive      |
|572   | 401 | 198 | 122 | b = negative      |
|694   | 222 | 377 | 254 | c = neutral       |
|412   | 121 | 269 | 304 | d = objective     |
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

###NaiveBayes Stop Words Removed
- Correctly Classified Instances:        
  - `3300`
  - `45.6432 %`
- Incorrectly Classified Instances:      
  - `3930`
  - `54.3568 %`
- Kappa statistic: `0.128`
- Mean absolute error: `0.3059`
- Root mean squared error: `0.4073`
- Relative absolute error: `88.3514 %`
- Root relative squared error: `97.8874 %`
- Total Number of Instances: `7230`     

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class |
| ----- |:------:|:------:|:--------:|
| 0.508 | 0.814 | 0.626 | positive |
| 0.347 | 0.121 | 0.18  | negative |
| 0.278 | 0.063 | 0.102 | neutral |
| 0.319 | 0.337 | 0.328 | objective |
| 0.401 | 0.456 | 0.388 | **`Weighted Avg`** |

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2673 | 153 | 107 | 351 | a = positive      |
| 925  | 157 | 71  | 140 | b = negative      |
| 1044 | 100 | 97  | 306 | c = neutral       |
| 616  | 43  | 74  | 373 | d = objective     |

----------------------------------------------------------------------------------------------------------------

####SMO Stop Words Removed
- Correctly Classified Instances        
  - `3733`               
  - `51.6321 %`
- Incorrectly Classified Instances      
  - `3497`               
  - `48.3679 %`
- Kappa statistic: `0.2746`
- Mean absolute error: `0.321`
- Root mean squared error: `0.4072`
- Relative absolute error: `92.7005 %`
- Root relative squared error: `97.874  %`
- Total Number of Instances: `7230`   

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.615     | 0.743  | 0.673      | positive         |
| 0.451     | 0.374  | 0.408      | negative         |
| 0.335     | 0.289  | 0.31       | neutral          |
| 0.424     | 0.329  | 0.37       | objective        |
| 0.497     | 0.516  | 0.502      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2439 | 268 | 382 | 195 |    a = positive   |
| 500  |483  |241  | 69  |    b = negative   |
| 646  |223  |447  |231  |    c = neutral    |
| 380  | 98  |264  |364  |    d = objective  |

----------------------------------------------------------------------------------------------------------------
###J48 Stop Words Removed
- Correctly Classified Instances        
  - `3366`               
  - `46.556 %`
- Incorrectly Classified Instances   
  - `3864`             
  - `53.444 %`
- Kappa statistic: `0.1833`
- Mean absolute error: `0.2983`
- Root mean squared error: `0.4187`
- Relative absolute error: `86.1384 %`
- Root relative squared error: `100.6348 %`
- Total Number of Instances: `7230`     

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.563     | 0.739  | 0.639      | positive         |
| 0.379     | 0.29   | 0.329      | negative         |
| 0.271     | 0.198  | 0.229      | neutral          |
| 0.324     | 0.234  | 0.272      | objective        |
| 0.431     | 0.466  | 0.439      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2426 | 283 | 356 | 219 |    a = positive   |
| 611  | 375 | 197 | 110 |    b = negative   |
| 812  | 217 | 306 | 212 |    c = neutral    |
| 461  | 114 | 272 | 259 |    d = objective  |

----------------------------------------------------------------------------------------------------------------
