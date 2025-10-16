# 💰 Cálculo de Salário– Sistema de Calculo de Salário
> Aplicativo Android em **Java** para calcular seu novo salário.

---

## 📱 Visão Geral

O **Cálculo de Salário** é um aplicativo Android desenvolvido para facilitar a **Previsão futura** do seu salário.  
Com uma **interface moderna e intuitiva**, o app permite digitar seu salário atual e escolher dentre 5 opções a porcentagem aplicada ao seu salário e com isso
terá resultados precisos e com uma interface morderna.

---

## 🚀 Funcionalidades

✅ **Cadastro de Salário** – Salário  
✅ **Exibição Inteligente** – Exibição em card com seu novo salário  
✅ **Interface Moderna** – Material Design e suporte a tema roxo escuro  
✅ **Seleção** – Seleção simples de porcentagens 

---

## 🛠️ Tecnologias Utilizadas

- **Java** – Linguagem principal
- **Android SDK** – Framework de desenvolvimento
- **XML** – Criação de layouts e interfaces
- **Material Design** – Componentes de UI modernos
- **LinearLayout** – Layouts organizados
- **Gradle** – Gerenciamento de dependências

---

## ⚙️ Como Executar

**Pré-requisitos:**
- Android Studio (versão mais recente)
- Emulador Android ou dispositivo físico com API 21+

**Passos:**
```bash
# 1. Clone o repositório
git clone https://github.com/EleandersonRosadeMorais/CalcularSalario

# 2. Acesse a pasta
cd CalcularSalario

# 3. Abra no Android Studio
"C:\Program Files\Android\Android Studio\bin\studio64.exe" .

# 4. Execute o app
# (Shift + F10 ou Run 'app')
```

---

## 📂 Estrutura do Projeto

```bash
📦 app
├── 📂 manifests/
│   └── AndroidManifest.xml
├── 📂 java/
│   └── 📂br.com.ulbra.calcularsalarios/
│       └── SalarioActivity.java
└── 📂 res/
     ├── 📂 drawable/
     │   └── food.png
     ├── 📂 layout/
     │   └── activity_salario.xml
     ├── 📂 mipmap/
     ├── 📂 values/
     └── 📂 xml/
 📂 Gradle Scripts/
```

---

## 💻 Exemplo de Código

```java
                double salario = Double.parseDouble(edsalario.getText().toString());
                int op = rgopcoes.getCheckedRadioButtonId();
                double novo_salario = 0;

                if (op == -1) {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(SalarioActivity.this);
                    dialogo.setTitle("Atenção");
                    dialogo.setMessage("Por favor, selecione um percentual!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                    ret
```

---

## 🎯 Objetivo do Projeto

Projeto desenvolvido com fins educacionais, com foco em:
- Práticas de programação **Java para Android**
- Uso de **Material Design** e boas práticas de UI/UX
- Estruturação e gerenciamento de dados no app
- Organização de código e arquitetura limpa
- Melhora continua da criatividade
- Desenvolvimento prático de **.xml** com **.java**

---

## 👤 Autor

**Eleanderson Rosa de Morais**  
📧 eleandersonmorais@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/eleanderson-rosa-de-morais-9aaab9324/)  
🔗 [GitHub](https://github.com/EleandersonRosadeMorais/)

---

## 💬 Contato

Dúvidas, sugestões ou colaborações?  
Entre em contato por email ou via redes sociais.  
Contribuições são bem-vindas! 🚀
