# Caca-ao-Tesouro

### Descrição do Projeto

"Caça ao Tesouro" é um jogo simples desenvolvido para dispositivos Android utilizando Jetpack Compose. O objetivo do jogo é clicar na imagem central para progredir na jornada em busca do tesouro. A cada clique, a imagem e o texto mudam para refletir o progresso do jogador. O jogo termina quando o jogador encontra o tesouro ou decide desistir.

### Funcionalidades

- **Progresso Interativo**: Cada clique na imagem central avança o jogador em sua busca pelo tesouro.
- **Imagens e Textos Dinâmicos**: As imagens e textos mudam conforme o jogador avança.
- **Botão de Desistência**: O jogador pode optar por desistir da busca a qualquer momento.
- **Reinício do Jogo**: Após encontrar o tesouro ou desistir, o jogador pode reiniciar o jogo.

### Como Configurar o Projeto

1. **Clone o Repositório**:
   ```
   git clone https://github.com/Matheuskmrs/Caca-ao-Tesouro.git
   ```

2. **Abra o Projeto no Android Studio**:
   - No Android Studio, selecione "Open an Existing Project" e navegue até o diretório onde você clonou o repositório.

3. **Alterar o Nome do Pacote**:
   - O pacote atual é definido como `com.example.cacaaotesouro`. Este é um nome de exemplo e deve ser alterado para refletir o domínio específico do seu projeto.
   - Para alterar o nome do pacote:
     - No Android Studio, clique com o botão direito no nome do pacote em `src/main/java/com/example/cacaaotesouro`.
     - Selecione "Refatorar" -> "Renomear".
     - Siga as instruções para refatorar o nome do pacote.

4. **Adicionar Imagens ao Projeto**:
   - As seguintes imagens são necessárias para o jogo e devem ser colocadas na pasta `res/drawable` do projeto Android:
     - `inicial.png`: Imagem inicial do jogo.
     - `nivel_2.png`: Imagem do segundo nível.
     - `nivel_3.png`: Imagem do terceiro nível.
     - `nivel_4.png`: Imagem final do tesouro encontrado.
     - `nivel_5.png`: Imagem mostrada quando o jogador desiste.
   - Para adicionar imagens:
     - Copie as imagens preparadas para a pasta `res/drawable`.
     - Certifique-se de que os nomes dos arquivos correspondem exatamente aos nomes referenciados no código.

5. **Executar o Projeto**:
   - Conecte um dispositivo Android ou inicie um emulador.
   - Clique no botão "Run" no Android Studio para compilar e executar o aplicativo no dispositivo.

### Estrutura do Projeto

- **MainActivity.kt**: A principal atividade que configura a interface do usuário e inicia o jogo.
- **Funções Composables**:
  - `CacaTesouroGame()`: Função principal que define o layout e a lógica do jogo.
  - `updateImage()`: Função que atualiza a imagem e o texto com base no progresso do jogo.
  - `resetGame()`: Função que reinicia o jogo para o estado inicial.

### Pré-requisitos

- Android Studio 4.1 ou superior.
- Conhecimento básico de Kotlin e Jetpack Compose.
- Um dispositivo Android ou um emulador configurado no Android Studio.

### Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.

---

Este README fornece todas as informações necessárias para configurar, executar e contribuir para o projeto "Caça ao Tesouro". Certifique-se de seguir todas as instruções para garantir uma experiência de desenvolvimento suave.
