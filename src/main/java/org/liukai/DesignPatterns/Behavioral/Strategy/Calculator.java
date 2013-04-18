package org.liukai.DesignPatterns.Behavioral.Strategy;

public enum Calculator {

	Add() {
		public int calculate(int a, int b) {
			return (a + b);

		}
	},
	Sub() {
		public int calculate(int a, int b) {
			return (a - b);

		}
	};

	public abstract int calculate(int a, int b);

}
