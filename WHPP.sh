#!/bin/bash
noHelp=""
optionHelp=0
optionAutre=0
for i in $*
do
  if [[ $i =~ (^-{1,2}h(elp)?$) ]]
  then #le param correspond à un help
    optionHelp=1
  else #c'est un paramètre autre que help
    noHelp=$noHelp" "$i
    optionAutre=1
  fi
done

if [ $optionAutre -eq 1 -a $optionHelp -eq 1 ]
then
  echo "Erreur: vous ne pouvez pas demander le manuel et lancer une commande."
  echo "Peut-être vouliez-vous écrire : "WHPP.sh $noHelp
elif [ $optionAutre -eq 1 -a $optionHelp -eq 0 ]
then
  #echo "On lance la commande normalement."
  #echo "Si un paramètre ne correspond à rien, c'est le code java qui le gère ?"
  java -jar WHILE_compiler.jar $*
else
  echo "Affichage du manuel."
fi
