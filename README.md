# FizzBuzz

## 概要
このリポジトリは、FizzBuzzプログラムを実行するためのものです。
1から100までの数を順に出力し、3の倍数はFizz、5の倍数はBuzz、両方の倍数はFizzBuzzと表示します。

__実行結果の例__

<img width="767" height="611" alt="Image" src="https://github.com/user-attachments/assets/973f6e7a-c6a4-4394-b523-ae186ad1633b" />


## 前提条件
・Javaがインストールされていること

## インストール手順
__Windows__

①Java公式サイトからJDKをダウンロード

②インストーラーの実行し、指示に従ってインストール

③環境変数の設定

・JAVA_HOME変数の設定
 
・Path変数の編集
  
④コマンドプロンプトで以下を実行しインストールができているかを確認
	java -version




## 使い方

コマンドプロンプトで以下の手順を実行してください。

### 1.リポジトリのクローンを作成します

アプリケーションのURLを取得します

	git clone <URL>
	# 任意のパスと名前を指定する場合
	git clone <URL> パス/名前　

### 2.プログラムのあるディレクトリへ移動します

	㏅　src
   
### 3.mainブランチに切り替えます

	git checkout main

### 4.プログラムをコンパイルして実行します
 
 Javaファイルをエンコーディングを指定してコンパイルします
 
	javac -encoding UTF-8 App.java　
 
プログラムを実行します

  	java App




