s-portfolio（ラーメンWebアプリ）

・概要
これは Spring Boot を使って開発した、日本の地方ごとのラーメンのギャラリーを表示するWebアプリです。  
ナビバーで画面遷移し、ギャラリーで写真やスクロールメッセージなどが見られます。

・使用技術
- Java（Spring Boot）
- HTML / CSS
- Oracle SQL（DB接続あり）

・画面イメージ
![トップページのスクリーンショット](./ramen/screenshot.png)

・起動方法（ローカル実行）
このプロジェクトは Eclipse（Spring Tools）環境での実行を前提としています。

・手順要項：
1. 本リポジトリを clone または zip ダウンロード
2. Eclipse で `ramen` プロジェクトをインポート（Mavenプロジェクトとして）
3. `src/main/resources/application.properties` にてDB接続等の設定を行う
4. `RamenApplication.java` を右クリック → 「Spring Boot アプリケーションとして実行」
5. `http://localhost:8080` にアクセスして動作確認

☆セットアップ手順（ローカル環境）
このアプリは Java（Spring Boot）で構築されており、ローカル環境で起動・画面確認ができます。  
以下の手順に従っていただければ、どなたでも画面遷移を確認できます。

・前提条件（インストールが必要なもの）
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 以上
- [Eclipse（Spring Tools または Pleiades版推奨）](https://mergedoc.osdn.jp/)
- Oracle Database（例：Oracle XE）
- Oracle JDBCドライバ（`ojdbc8.jar` など）

・当リポジトリをクローン
GitHubのこのリポジトリをクローン、またはZIPでダウンロードしてください。
GitBashにて以下を入力。
```bash
git clone https://github.com/sbt18hurang/s-portfolio.git

・Eclipseでプロジェクトを読み込む
-Eclipseを起動
-「ファイル」→「インポート」→「既存の Maven プロジェクト」
-フォルダ s-portfolio/ramen を選択
-プロジェクトが読み込まれたらビルド完了を待つ

・Oracle DBの設定を確認
src/main/resources/application.properties に、以下のようにDB接続情報を記述します。

spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.database-platform=org.hibernate.dialect.Oracle12cDialect
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

・アプリを実行する
RamenApplication.java を右クリック

「Spring Boot アプリケーションとして実行」を選択

コンソールに Started RamenApplication と出れば成功。

・ ブラウザで画面を確認
以下のURLにアクセス：

http://localhost:8080/ramen/

