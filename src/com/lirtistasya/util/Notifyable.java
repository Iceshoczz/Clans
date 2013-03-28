package com.lirtistasya.util;

public interface Notifyable {
	public void notify( NotificationCause<? extends Source> cause );
}
