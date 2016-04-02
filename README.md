# Sentiment-Analyzer
You can find the GitHub repository for this project at 
- https://github.com/atang100/Sentiment-Analyzer

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

Below you can see the baseline results compared to the remove stop words results.

----------------------------------------------------------------------------------------------------------------

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

As seen above, removing the stop words improved the Correctly classified instances of the **NaiveBayes** classifier by
about 0.5% but reduced the accuracy of the **SMO** and **J48** classifiers by about 1%. We decided to stick with the removed
stop words because it sped up the **Weka** execution time significantly which increased our efficiency throughout the
assignment.

----------------------------------------------------------------------------------------------------------------

##Steps Taken In Part 2
In the second part of the assignment we tried to improve upon our results achieved by removing the stop words.
While it would be infeasible to list the results of all our executions, we will list the results of the most important
executions to get demonstrate the increase in accuracy achieved by newly added features. All the result files can be found in
project folder under weka_results.

As in step 1, we used the StringToWordVector to tokenize the tweet words in our output.arff file. The difference between part 2
and part 1 is that we decided to add a number of features. We decided to count the number of ! and ? per tweet as a feature,
count the number of positive and negative emoticons :) | :(, and we counted the number of positive and negative words in each
tweet.

For the positive and negative words we combined 2 dictionaries which gave us a total of 13666 words:
- https://github.com/jeffreybreen/twitter-sentiment-analysis-tutorial-201107/tree/master/data/opinion-lexicon-English
- http://www.site.uottawa.ca/~diana/csi4107/tweet/subjectivity_clues_hltemnlp05.tar.gz

Combining both dictionaries increased the Correctly classified instances by about 1% compared to just using a single
dictionary. To create the feature, we simply counted the number of positive, negative, or neutral word occurrences per tweet
and added the result to the output.arff file.

The same principle was used for emoticons and punctuation. However for punctuation we did not use a dictionary since we were
only counting the ! and ?.

Below we will display the results for the experiments that we ran and we will discuss them after.

----------------------------------------------------------------------------------------------------------------

###NaiveBayes Punctuation and Emoticon features
This contains only the punctuation and emoticon features + the removed stop words.

- Correctly Classified Instances        
  - `3477`               
  - `48.0913 %`
- Incorrectly Classified Instances      
  - `3753`               
  - `51.9087 %`
- Kappa statistic:               `0.23`  
- Mean absolute error:           `0.294`
- Root mean squared error:       `0.4036`
- Relative absolute error:       `84.914 %`
- Root relative squared error:   `97.0096 %`
- Total Number of Instances:     `7230`

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.607     | 0.732  | 0.664      |  positive        |
| 0.349     | 0.29   | 0.317      |  negative        |
| 0.336     | 0.105  | 0.16       |  neutral         |
| 0.313     | 0.485  | 0.38       |  objective       |
| 0.458     | 0.481  | 0.45       |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2404 | 308 | 126 | 446 | a = positive      |
| 552  | 375 | 98  | 268 | b = negative      |
| 654  | 267 | 162 | 464 | c = neutral       |
| 350  | 124 | 96  | 536 | d = objective     |

----------------------------------------------------------------------------------------------------------------

###NaiveBayes Positive and Negative words Features
This contains only the positive and negative word features + the removed stop words.

- Correctly Classified Instances        
  - `3556`               
  - `49.184 %`
- Incorrectly Classified Instances      
  - `3674`               
  - `50.816 %`
- Kappa statistic:                      ` 0.2379`
- Mean absolute error:                   `0.2897`
- Root mean squared error:               `0.4021`
- Relative absolute error:               `83.6519 %`
- Root relative squared error:           `96.6375 %`
- Total Number of Instances:             `7230`

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.597     | 0.734  | 0.659      | positive         |
| 0.462     | 0.316  | 0.375      | negative         |
| 0.298     | 0.205  | 0.243      | neutral          |
| 0.337     | 0.381  | 0.358      | objective        |
| 0.469     | 0.492  | 0.473      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2410 | 226 | 308 | 340 | a = positive      |
| 515  | 408 | 235 | 135 | b = negative      |
| 699  | 178 | 317 | 353 | c = neutral       |
| 410  | 71  | 204 | 421 | d = objective     |

----------------------------------------------------------------------------------------------------------------

As you can see using the NaiveBayes classifier adding the punctuation, emoticons and positive and negative word features
significantly improved the Correctly Classified Instances (3 - 4%).

We next attempted to merge the features into one experiment and see what results we could achieve.

----------------------------------------------------------------------------------------------------------------

###NaiveBayes Emotion + Punctuation + Positive and Negative Word Features
This contains the emoticon + punctuation + positive and negative word features along with the removed stop words.

- Correctly Classified Instances        
  - `3662`               
  - `50.6501 %`
- Incorrectly Classified Instances      
  - `3568`               
  - `49.3499 %`
- Kappa statistic:                       `0.2906`
- Mean absolute error:                   `0.2786`
- Root mean squared error:               `0.399`
- Relative absolute error:               `80.4593 %`
- Root relative squared error:           `95.8999 %`
- Total Number of Instances:             `7230`     

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.679     | 0.702  | 0.69       | positive         |
| 0.439     | 0.391  | 0.413      | negative         |
| 0.34      | 0.155  | 0.213      | neutral          |
| 0.309     | 0.554  | 0.397      | objective        |
| 0.507     | 0.507  | 0.494      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2304 | 278 | 198 | 504 | a = positive      |
| 379  | 505 | 131 | 278 | b = negative      |
| 456  | 262 | 240 | 589 | c = neutral       |
| 252  | 105 | 136 | 613 | d = objective     |

----------------------------------------------------------------------------------------------------------------

###SMO Emotion + Punctuation + Positive and Negative Word Features
This contains the emoticon + punctuation + positive and negative word features along with the removed stop words.

- Correctly Classified Instances        
  - `3832`               
  - `53.0014 %`
- Incorrectly Classified Instances      
  - `3398`               
  - `46.9986 %`
- Kappa statistic:                       `0.3038`
- Mean absolute error:                   `0.3184`
- Root mean squared error:               `0.4048`
- Relative absolute error:               `91.9449 %`
- Root relative squared error:           `97.2969 %`
- Total Number of Instances:             `7230`     

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.661     | 0.75   | 0.703      | positive         |
| 0.462     | 0.41   | 0.435      | negative         |
| 0.324     | 0.314  | 0.318      | neutral          |
| 0.412     | 0.32   | 0.36       | objective        |
| 0.515     | 0.53   | 0.52       |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2463 | 261 | 392 | 168 |    a = positive   |
| 409  | 530 | 271 |  83 |    b = negative   |
| 554  | 254 | 485 | 254 |    c = neutral    |
| 300  | 101 | 351 | 354 |    d = objective  |

----------------------------------------------------------------------------------------------------------------

###J48 Emotion + Punctuation + Positive and Negative Word Features
This contains the emoticon + punctuation + positive and negative word features along with the removed stop words.

- Correctly Classified Instances        
  - `3671`               
  - `50.7746 %`
- Incorrectly Classified Instances      
  - `3559`               
  - `49.2254 %`
- Kappa statistic:                       `0.2661`
- Mean absolute error:                   `0.28`  
- Root mean squared error:               `0.4094`
- Relative absolute error:               `80.8549 %`
- Root relative squared error:           `98.3974 %`
- Total Number of Instances:             `7230`

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.64      | 0.746  | 0.689      | positive         |
| 0.444     | 0.418  | 0.431      | negative         |
| 0.301     | 0.287  | 0.294      | neutral          |
| 0.333     | 0.213  | 0.26       | objective        |
| 0.485     | 0.508  | 0.493      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2450 | 279 | 395 | 160 | a = positive      |
| 398  | 541 | 278 |  76 | b = negative      |
| 603  | 263 | 444 | 237 | c = neutral       |
| 377  | 136 | 357 | 236 | d = objective     |

----------------------------------------------------------------------------------------------------------------

Comparing the above **NaiveBayes** and **J48** results to the baseline results we have achieved a ~5% Correctly Classified
Instances increase. Unfortunately for **SMO** the increase was no where near as big. We achieved an increase of just ~0.5%.

----------------------------------------------------------------------------------------------------------------

##Best results
Our best results were achieved using the **ComplementNaiveBayes** classifier and our second best was using **MultiboostAB**
with the **ComplementNaiveBayes** and **SMO** classifiers.

----------------------------------------------------------------------------------------------------------------

###ComplementNaiveBayes
This contains the emoticon + punctuation + positive and negative word features along with the removed stop words.

- Correctly Classified Instances        
  - `3992`               
  - `55.2144 %`
- Incorrectly Classified Instances      
  - `3238`               
  - `44.7856 %`
- Kappa statistic:                       `0.3552`
- Mean absolute error:                   `0.2239`
- Root mean squared error:               `0.4732`
- Relative absolute error:               `64.6673 %`
- Root relative squared error:           `113.7283 %`
- Total Number of Instances:             `7230`

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.724     | 0.733  | 0.729      | positive         |
| 0.448     | 0.537  | 0.489      | negative         |
| 0.362     | 0.231  | 0.282      | neutral          |
| 0.389     | 0.481  | 0.43       | objective        |
| 0.546     | 0.552  | 0.545      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2408 | 347 | 226 | 303 | a = positive      |  
| 297  | 694 | 183 | 119 | b = negative      |  
| 417  | 359 | 358 | 413 | c = neutral       |
| 203  | 148 | 223 | 532 | d = objective     |   

----------------------------------------------------------------------------------------------------------------

###MultiboostAB
This contains the emoticon + punctuation + positive and negative word features along with the removed stop words.

- Correctly Classified Instances        
  - `3910`               
  - `54.0802 %`
- Incorrectly Classified Instances      
  - `3320`               
  - `45.9198 %`
- Kappa statistic:                       `0.3326`
- Mean absolute error:                   `0.2558`
- Root mean squared error:               `0.4082`
- Relative absolute error:               `73.8824 %`
- Root relative squared error:           `98.1029 %`
- Total Number of Instances:             `7230`

####Detailed Accuracy By Class
| Precision | Recall | F-Measure  |  Class           |
| --------- |:------:|:----------:|:----------------:|
| 0.699     | 0.741  | 0.719      | positive         |
| 0.426     | 0.476  | 0.45       | negative         |
| 0.36      | 0.242  | 0.29       | neutral          |
| 0.385     | 0.441  | 0.411      | objective        |
| 0.53      | 0.541  | 0.532      |**`Weighted Avg`**|

####Confusion Matrix
| a    | b   | c   | d   | <-- classified as |
|------|-----|-----|-----|-------------------|
| 2432 | 328 | 247 | 277 | a = positive      |
| 351  | 615 | 190 | 137 | b = negative      |
| 464  | 344 | 375 | 364 | c = neutral       |
| 234  | 155 | 229 | 488 | d = objective     |

----------------------------------------------------------------------------------------------------------------

Looking at the results above, we can see that choosing the right classifier makes a big difference when it comes to the
accuracy of the results. Unfortunately we don't have any baseline results for the above classifiers due to time constraints.
The **MultiboostAB** classifier alone took 3 hours to complete execution. We just simply did not have enough time to run them
again.

While we didn't list all the execution results here, they can all be found in their own text files under the weka_results
directory. The best results that we have are in the file Results.txt under that folder as requested.

----------------------------------------------------------------------------------------------------------------

##Features that did not Improve Results
While you can look at the results in the weka_results folder, we wanted to talk about the features that we tried to use to
improve results that did not succeed.

1. We attempted to remove just the "#" characters from the tweets in an attempt to allow the hashtags to match a positive or
negative word in our dictionaries. This negatively impacted results and thus we did not continue to use it.

2. As we mentioned earlier in the report removing the stop words at first negatively impacted the results. We thus attempted
to use the new features along with stop words in the tweets. The negatively affecting results that we had observed earlier
without the features were no longer observed and so the new features neglected what we had observed. Thus we continued to
remove the stop words from the tweets.

----------------------------------------------------------------------------------------------------------------

##How to run the Java Program

To run the Java program it's pretty simple. Just import the root folder into **Eclipse** as an existing project.
Once the project has been imported click on the **Extractor.java** file in the `extractor` folder and click the run button.
The main method contained in this file will call the necessary methods to remove all the stop words from the tweets
(similarly to assignment 1) and remove any unwanted characters.

The same class is responsible for implementing all the features. Meaning that the **Extractor.java** class contains the methods implementing the negative and positive word feature, emoticon feature, and the punctuation feature. The **Tweet.java** class is an object that helps us abstract a tweet into it's own class along with some helper methods. The **Stop_Word.java** class, abstracts away all the stop word removal functionality. Same with the **Emoticon.java** class. 

Finally the **Extractor.java** class also adds the message back into an output.arff file along with all the features and
categories.

Once the program is done executing, open **Weka** and click `open file` and browse for the output.arff file created by the
Java program. Before running a classifier you must run it through the **StringToWordVector** filter. After that's done, you
can run it through any classifier of your choosing.

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
