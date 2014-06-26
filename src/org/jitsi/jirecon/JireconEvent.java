/*
 * Jirecon, the Jitsi recorder container.
 * 
 * Distributable under LGPL license. See terms of license at gnu.org.
 */
package org.jitsi.jirecon;

/**
 * Running event of <tt>Jirecon</tt>, which means some important things
 * happened.
 * 
 * @author lishunyang
 * 
 */
public class JireconEvent
{
    /**
     * Event type.
     */
    private Type type;

    /**
     * MUC jid, represents a JireconTask.
     */
    private String mucJid;

    /**
     * Construction method.
     * 
     * @param source indicates where this event comes from.
     * @param type indicates the event type.
     */
    public JireconEvent(String mucJid, Type type)
    {
        this.mucJid = mucJid;
        this.type = type;
    }

    /**
     * Get event type.
     * 
     * @return event type
     */
    public Type getType()
    {
        return type;
    }

    /**
     * Get MUC jid.
     * 
     * @return jid of MUC.
     */
    public String getMucJid()
    {
        return mucJid;
    }

    /**
     * <tt>JireconEvent</tt> type.
     * 
     * @author lishunyang
     * 
     */
    public enum Type
    {
        /**
         * Task failed
         */
        TASK_ABORTED("TASK_ABORTED"),

        /**
         * Operation
         */
        TASK_FINISED("TASK_FINISHED");

        private String name;

        private Type(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name;
        }
    }
}
