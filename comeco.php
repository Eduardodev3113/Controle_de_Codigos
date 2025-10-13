<table>
  <th>
  <div id="center_button">
  <button onclick="location.href='dashboard.php'"> Painel de controle </button>
  </div>
  </th>
</table>
<?php

$username='miguelde_modulo4';
$password='modulo4';
$dbname='miguelde_modulo4';
$host='localhost';

echo 
'
<h3> Site de Eduardo e Vini - Listagem de Leituras</h3>
<table border=2>
<tr>
<td>ID Leitura</td>
<td>Placa MAC</td>
<td>Nome placa</td>
<td>Data leitura</td>
<td>Hora Leitura</td>
<td>Valor</td>
<td>Volume</td>
<td>Peso</td>
</tr>
';
try {	
 $conn = new PDO("mysql:host=$host;dbname=$dbname", $username, $password);
 $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
 $sql='SELECT leituralata.idleituralata,
 leituralata.maclata_idmaclata,
 maclata.nome,
 leituralata.dataleitura,
 leituralata.horaleitura,
 leituralata.valor,
 leituralata.volume,
 leituralata.peso
FROM leituralata , maclata
WHERE leituralata.maclata_idmaclata=maclata.idmaclata';

 $data = $conn->query($sql);
 foreach($data as $row) {
 echo'<td>'.($row[0]).'</td>';
 echo'<td>'.($row[1]).'</td>';
 echo'<td>'.($row[2]).'</td>';
 echo'<td>'.($row[3]).'</td>';
 echo'<td>'.($row[4]).'</td>';
 echo'<td>'.($row[5]).'</td>';
 echo'<td>'.($row[6]).'</td>';
 echo'<td>'.($row[7]).'</td><tr>';
 }echo'</table>';
} catch(PDOException $e) {
 echo 'ERROR: ' . $e->getMessage();
}
 ?>