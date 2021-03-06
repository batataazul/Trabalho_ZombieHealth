package zumbi.Componentes.Supervisor;

import java.util.*;

public class FrasesGenerator3000 {
	public static String getFrase() {
		String frases[] = {
				"As coisas poderiam ser muito piores: imagina ser o paciente.",
				"Lembre-se: se fosse fácil você não faria.",
				"Não desanime. Tudo vai piorar.",
				"Acredite. Você nasceu para conquistar grandes fracassos.",
				"Você não só tem o direito de ser feliz como também tem a obrigação de lutar para alcançar a felicidade.",
				"As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que ele é recomendado diariamente.",
				"Já experimentou acreditar em você? Tente! Você não faz ideia do que é capaz, nem eu.",
				"Se quer viver uma vida feliz, amarre-se a uma meta, não a pessoas nem a coisas.",
				"Aquilo que você está vivendo, o peso que você está carregando, nada se compara ao que está por vir.",
				"É com restos fecais que se aduba a vida.",
				"Uma vida vale mais do que mil palavras, quantas você já salvou?",
				"Sem lutas não há derrotas.",
				"Se não souber o que fazer, pense até desistir.",
				"Tudo que você precisa para começar a realizar seus sonhos é confiar em você, e lutar sem ter medo de falhar.", 
				"A melhor maneira de melhorar o padrão de vida está em melhorar o padrão de pensamento.",
				"Seja sempre otimista, pois ninguém merece encarar a vida narrada em detalhes.",
				"Alcançar o que se deseja dá trabalho, mas não pare de lutar porque está cansado; pare apenas quando tiver triunfado!",
				"Não se desanime diante dos obstáculos, eles são sempre uma oportunidade de você sair mais forte de uma situação.",
				"Não se compare aos outros, apenas espere o melhor de você mesmo.",
				"Vim, vi, vacinei.",
				"Fique tranquilo! Amanhã você vai achar um jeito de sorrir daquilo que hoje lhe fez chorar.",
				"Não importa se seu sonho vai se realizar hoje, amanhã ou nunca, mas sim que você trabalhe para o alcançar todos os dias.",
				"Muitas vezes a vida é arriscar tudo por algo que ninguém mais pode ver além de você. Ou vocẽ é um gênio, ou um iludido.",
				"Às vezes desistir parece a saída mais fácil, e é verdade, mas eu não jogo Dark Souls à toa.",
				"Desistir é para os fracos ou para quem já não acredita mais no impossível!",
				"É possível cometer nenhum erro e ainda sim perder. A isso damos o nome vida.",
				"Se você não acredita em você mesmo, acredite em mim, porque eu acredito em você.",
				"O que é imortal não morre no final",
				""
		};
		
		Random gerador = new Random();
		return frases[gerador.nextInt(Arrays.asList(frases).size())];
	}
}
