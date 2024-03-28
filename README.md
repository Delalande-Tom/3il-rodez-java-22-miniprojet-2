<h1>Repérage et direction sur une carte en 2D</h1>

<h2>Questions</h2>
<h3>Question 1 : </h2>
<p>Quelle structure de données pourrait être utilisée pour stocker les relations entre les nœuds du graphe et les informations associées à ces relations, comme les coûts des arêtes ?</p>
<p>- Une map on vas associé le noeud à ses voisins</p>

<h3>Question 2 : </h3>
<p>Pourquoi pensez-vous que les classes Noeud et Graphe ont été définies avec des paramètres génériques ?</p>

<p> L'intéret d'avoir utiliser des types générique est de pouvoir utiliser cet algorithme sur n'importe quoi à partir du moement ou ça respecte les conditions initiales </p>

<h3>Question 3 : </h3>
<p>Pourquoi pensez-vous que la création d'une interface est une bonne pratique dans ce contexte ?</p>

<p>Je pense qu'effectivement cela est une bonne pratique ainsi nous pourrions implémenter différents algorithme de recherche de chemin, en utilisant l'interface dans différente classes</p>

<h2> Ce qui a été fait </h2>

<p> J'ai implémenté l'algorithme de Dijkstra pour trouver le chemin le plus court entre deux noeuds d'un graphe. </p>
<p> J'ai implémenté l'algorithme A* </p>
<p>Des Test</p>

<h2> Difficulté rencontré </h2>
<p> J'ai eu du mal à comprendre comment fonctionne l'algorithme A* </p>
<p> J'ai eu du mal a faire "L'adaptateur"</p>