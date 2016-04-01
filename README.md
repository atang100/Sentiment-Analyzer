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

Additionally for part 1 once we had gotten our baseline results, we removed stop words from the tweets using a similar dictionnary to what
we used in assignment 1.

Below you can see the baseline results compared to the remove stop words results:
###NaiveBayes Removed Stop Words
Correctly Classified Instances        3300               45.6432 %
Incorrectly Classified Instances      3930               54.3568 %
Kappa statistic                          0.128 
Mean absolute error                      0.3059
Root mean squared error                  0.4073
Relative absolute error                 88.3514 %
Root relative squared error             97.8874 %
Total Number of Instances             7230     

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
