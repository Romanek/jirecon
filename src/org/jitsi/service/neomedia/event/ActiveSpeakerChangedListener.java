/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package org.jitsi.service.neomedia.event;

/**
 * Implementing classes can be notified about changes to the 'active' stream
 * (identified by its SSRC) using {@link #activeSpeakerChanged(long)}.
 *
 * @author Boris Grozev
 */
public interface ActiveSpeakerChangedListener
{
    public void activeSpeakerChanged(long ssrc);
}
