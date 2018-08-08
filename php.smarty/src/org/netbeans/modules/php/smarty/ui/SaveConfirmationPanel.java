/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.smarty.ui;

import org.openide.util.ImageUtilities;

/**
 *
 * @author Martin Fousek <marfous@netbeans.org>
 */
public class SaveConfirmationPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form SaveConfirmationPanel.
     */
    public SaveConfirmationPanel(String warningMessage) {
        initComponents();
        message.setText(warningMessage);
    }

    public boolean isDoNotShowAgainCheckBox() {
        return doNotShowAgainCheckBox.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        doNotShowAgainCheckBox = new javax.swing.JCheckBox();

        jLabel1.setIcon(ImageUtilities.loadImageIcon("org/netbeans/modules/dialogs/warning.gif", false));

        org.openide.awt.Mnemonics.setLocalizedText(doNotShowAgainCheckBox, org.openide.util.NbBundle.getMessage(SaveConfirmationPanel.class, "SaveConfirmationPanel.doNotShowAgainCheckBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(message))
                    .addComponent(doNotShowAgainCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(message))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(doNotShowAgainCheckBox))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox doNotShowAgainCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}