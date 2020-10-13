# read n
# read -a val
# evensqr=0 oddsqr=0
# for (( i=0;i<$n;i++))
# do
#     if (( ${val[i]} % 2 == 0 ))
#     then
        
#         evensqr=$(( $evensqr + $(( ${val[i]} * ${val[i]} )) ))
    
#     else
#         oddsqr=$(( $oddsqr + $(( ${val[i]} * ${val[i]} )) )) 
        
#     fi
# done;
# echo $(( $evensqr - $oddsqr ))
# echo  ${#val[@]}

#!/bin/bash

# awk 'BEGIN{e=0;o=0} {if ($0%2==0) {e+=$0*$0} else { o+=$0*$0}} END{print (e-o)}'
awk 'BEGIN{}{print($1)}END{}' 