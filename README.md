Vytváøení a správa faktur
Použité technologie :  	Java swing
		        Derby databáze
			Github – správa zdrojových kódu

Použité komponenty:	JCalendar
			iText

Program umí vytvoøit fakturu na urèitou osobu, taky umí editovat již vytvoøenou fakturu, a nadále na danou fakturu vytvoøit pdf.

Tøídy:
			DatabaseConnect – komunikuje s databází, pøipoj, select,insert,odpoj
			Faktury – komunikace mezi databázi a tabulkou
			PDF  - pracuje s fakturami, z kterých vytváøí PFD soubory
			
